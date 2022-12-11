package com.example.ytproject

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import androidx.core.view.MenuItemCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ytproject.API.ApiClient
import com.example.ytproject.API.ApiClient.Companion.API_KEY
import com.example.ytproject.API.ApiInterface
import com.example.ytproject.Activitys.BaseActivity
import com.example.ytproject.Adapters.SearchResultAdapter
import com.example.ytproject.Model.SearchModel.SearchModel
import com.example.ytproject.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createDialog()


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        val searchViewItem: MenuItem = menu!!.findItem(R.id.app_bar_search)
        val searchView: SearchView = MenuItemCompat.getActionView(searchViewItem) as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                showDialog()
                getSearchItems(query)

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                return false
            }
        })

        return super.onCreateOptionsMenu(menu)
    }

    private fun getSearchItems(query: String?) {

        var apiInterface = ApiClient.getApiClient().create(ApiInterface::class.java)
        apiInterface.getSearchResults(query!!, API_KEY)
            .enqueue(object : Callback<SearchModel> {
                override fun onResponse(call: Call<SearchModel>, response: Response<SearchModel>) {

                    closeDialog()
                   if (response.isSuccessful) {
                    var data = response.body()?.contents

                        Toast.makeText(applicationContext, query+" =="+data?.size, Toast.LENGTH_SHORT).show()
                    if (data?.size!! > 0) {
                        binding.searchList.layoutManager = LinearLayoutManager(applicationContext)
                        binding.searchList.adapter = SearchResultAdapter(data)

                    }
                   } else {
                       Toast.makeText(applicationContext, ""+response.code(), Toast.LENGTH_SHORT).show()
                   }

                }

                override fun onFailure(call: Call<SearchModel>, t: Throwable) {

                }

            })


    }
}
package com.android.testing.repository

import androidx.lifecycle.LiveData
import com.android.testing.data.local.ShoppingItem
import com.android.testing.data.remote.responses.ImageResponse
import com.android.testing.other.Resource

interface ShoppingRepository {
    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>
}
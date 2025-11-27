package com.example.wishlist.data

import kotlinx.coroutines.flow.Flow

class WishRepository(
    private val wishDao: WishDao,
) {
    suspend fun addAWish(wish: Wish) {
        wishDao.addWish(wish)
    }

    fun getAllWishes(): Flow<List<Wish>> {
        return wishDao.getAllWishes()
    }

    suspend fun updateWish(wish: Wish) {
        wishDao.updateWish(wish)
    }

    suspend fun deleteWish(wish: Wish) {
        wishDao.deleteWish(wish)
    }

    fun getWishById(id: Long): Flow<Wish> {
        return wishDao.getWishById(id)
    }

}
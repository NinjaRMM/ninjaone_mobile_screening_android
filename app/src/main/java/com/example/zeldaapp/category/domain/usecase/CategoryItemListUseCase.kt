package com.example.zeldaapp.category.domain.usecase

import com.example.zeldaapp.category.data.model.CategoryItemDto
import com.example.zeldaapp.category.data.repository.ICategoryRepository
import com.example.zeldaapp.category.domain.mapper.toCategoryItemList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

private const val CREATURES: String = "creatures"  // This could be moved somewhere else

class CategoryItemListUseCase(
    private val repository: ICategoryRepository

) {

    suspend operator fun invoke(
        category: String
    ) = withContext(Dispatchers.IO) { // Here we could inject Dispatchers.IO in constructor instead of hardcoding it.
        val categories: List<CategoryItemDto> = when (val lowercaseCategory = category.lowercase()) {
            CREATURES -> {
                val creaturesItemList = repository.getCreaturesItemList()
                creaturesItemList.food?.plus(creaturesItemList.nonFood ?: emptyList()) ?: creaturesItemList.nonFood ?: emptyList()
            }
            else -> repository.getCategoryItemList(lowercaseCategory)
        }
        categories.toCategoryItemList().sortedBy { it.name }
    }



}
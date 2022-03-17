package com.plcoding.cryptocurrencyappyt.presentation.theme.coin_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.plcoding.cryptocurrencyappyt.presentation.theme.coin_list.components.CoinListItem

class CoinListScreen {
    @Composable
    fun CoinListScreen(
        navController: NavController,
        viewModel: CoinListViewModel = hiltViewModel()
    ) {
        val state = viewModel.state.value
        Box(modifier = Modifier.fillMaxSize()) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(state.coins) { coin ->
                    CoinListItem(
                            coin = coin,
                        onItemClick = {
                    }
                    )
                }

            }
        }
    }
}
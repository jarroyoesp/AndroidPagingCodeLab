package com.example.android.codelabs.paging.ui

import com.example.android.codelabs.paging.model.Repo

sealed class UiModel {


    data class RepoItem(val repo: Repo) : UiModel()
    data class SeparatorItem(val description: String) : UiModel()
}
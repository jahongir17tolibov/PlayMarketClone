package com.jt17.playmarketclone.models

data class ParentModel(
    val mainTitle: String,
    val childrens: List<ChildModel>
) {
    data class ChildModel(
        val image: Int,
        val appName: String,
        val smallImg: Int,
        val typeP: String
    )
}

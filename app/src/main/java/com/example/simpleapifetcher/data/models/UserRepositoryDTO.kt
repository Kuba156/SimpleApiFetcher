package com.example.simpleapifetcher.data.models
import com.google.gson.annotations.SerializedName


data class UserRepositoryDTO(
    @SerializedName("name")
    val name: String?,
    @SerializedName("owner")
    val owner: Owner?,
    @SerializedName("description")
    val description: String?
)

data class Owner(
    @SerializedName("account_id")
    val accountId: String?,
    @SerializedName("display_name")
    val displayName: String?,
    @SerializedName("links")
    val links: Links?,
    @SerializedName("nickname")
    val nickname: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("uuid")
    val uuid: String?
)

data class Links(
    @SerializedName("avatar")
    val avatar: Avatar?,
    @SerializedName("html")
    val html: Html?,
    @SerializedName("self")
    val self: Self?
)

data class Avatar(
    @SerializedName("href")
    val href: String?
)

data class Html(
    @SerializedName("href")
    val href: String?
)

data class Self(
    @SerializedName("href")
    val href: String?
)
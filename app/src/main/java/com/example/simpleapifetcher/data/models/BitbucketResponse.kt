package com.example.simpleapifetcher.data.models
import com.google.gson.annotations.SerializedName

data class BitbucketResponse(
    @SerializedName("values")
    var values: Array<UserRepository>
)

data class UserRepository(
    @SerializedName("name")
    var name: String?,
    @SerializedName("owner")
    var owner: Owner?,
    @SerializedName("description")
    var description: String?
)

data class Owner(
    @SerializedName("account_id")
    var accountId: String?,
    @SerializedName("display_name")
    var displayName: String?,
    @SerializedName("links")
    var links: Links?,
    @SerializedName("nickname")
    var nickname: String?,
    @SerializedName("type")
    var type: String?,
    @SerializedName("uuid")
    var uuid: String?
)

data class Links(
    @SerializedName("avatar")
    var avatar: Avatar?,
    @SerializedName("html")
    var html: Html?,
    @SerializedName("self")
    var self: Self?
)

data class Avatar(
    @SerializedName("href")
    var href: String?
)

data class Html(
    @SerializedName("href")
    var href: String?
)

data class Self(
    @SerializedName("href")
    var href: String?
)
package dk.colle.steamproject

data class NetworkApplistWrapper<T>(val applist: NetworkAppsWrapper<T>)

data class NetworkAppsWrapper<T>(val apps: T)

data class NetworkInformationWrapper<T>(val success: Boolean, val data: T)
package net.vrallev.kapt3.bug

import com.google.auto.value.AutoValue

@AutoValue
abstract class SomeAutoValueObject {

    abstract val userId: Int
    abstract val photoUrl: String
    abstract val contactName: String
    abstract val lastSendDate: Long

    @AutoValue.Builder
    abstract class Builder {
        abstract fun setUserId(newUserId: Int): Builder

        abstract fun setPhotoUrl(newPhotoUrl: String): Builder

        abstract fun setContactName(newContactName: String): Builder

        abstract fun setLastSendDate(newLastSendDate: Long): Builder

        abstract fun build(): SomeAutoValueObject
    }

    companion object {

        fun builder(): Builder {
            return AutoValue_SomeAutoValueObject.Builder()
        }
    }
}

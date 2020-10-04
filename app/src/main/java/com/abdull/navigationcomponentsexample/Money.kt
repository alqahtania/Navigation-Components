package com.abdull.navigationcomponentsexample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

/**
 * Created by Abdullah Alqahtani on 10/4/2020.
 */

@Parcelize
data class Money(val amount : BigDecimal) : Parcelable {
}
package pt.iade.ei.greenventos.models

import java.util.Calendar

data class EventItem(
    val id: Int,
    val title:String,
    val date: Calendar,
    val room: String,
    val duration:Int
)

fun hoursToMinutes(hours : Int) : Int{
    return hours * 60
}
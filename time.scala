import java.text.SimpleDateFormat
import java.time.ZoneId
import java.util.Date

val time = new Date()                                       //or system.currentTime() for current time
val epoch = time.getTime()/1000L                            //time to epoch
time = new Date(1529611151)                                 //epoch to time

time = new Date(epoch + (1000*10))                          //add 10 seconds
time = new Date(epoch + (1000*60*10))                       //add 10 minutes(active support)

val d = new Date().toInstant.atZone(ZoneId.of("UTC"))				//convert to UTC
val e = new SimleDateFormat("Z").format(time)                        //get the timezone
                                                                    //convert to local zone
val d = new Date().toInstant.atZone(ZoneId.of("IST"))				//convert to any known timezone

val f = new SimleDateFormat("dd").format(time)                      //get the day
val g = new SimleDateFormat("mm").format(time)						//get the month
val h = new SimleDateFormat("yy").format(time)						//get the year


val i = new SimleDateFormat("dd_MM_YYYY").format(time)							//Format time to string
val j = new SimleDateFormat("dd_mm_YYYY").parse("21_12_1993")           //Format string to time

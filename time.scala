import java.text.SimpleDateFormat
import java.time.ZoneId
import java.util.Date

val time = new Date()								//or system.currentTime() for current time
val epoch = time.getTime()/1000L					//time to epoch
time = new Date(1529611151)							//epoch to time

time = new Date(epoch + (1000*10))					//add 10 seconds
time = new Date(epoch + (1000*60*10))				//add 10 minutes(active support)

										//convert to UTC
										//get the timezone
									//convert to local zone
						//convert to any known timezone

										//get the day
									//get the month
									//get the year
									//slit time into 10 components

							//Format time to string
			//Format string to time
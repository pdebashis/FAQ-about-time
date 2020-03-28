require 'time'
require 'active_support/core_ext/numeric/time.rb'

class MainClass
	time=Time.new									#or Time.now for current time
	epoch=time.to_i									#time to epoch
	time=Time.at(1529611151)						#epoch to time

	time=time+10									#add 10 seconds
	time=time+10.minutes							#add 10 minutes(active support)

	time=time.utc									#convert to UTC
	zone=time.zone									#get the timezone
	time=time.getlocal								#convert to local zone
	time=time.getlocal("+03:00")					#convert to any known timezone

	day=time.day									#get the day
	month=time.month								#get the month
	year=time.year									#get the year
	arr=time.to_a									#slit time into 10 components

	string=time.strftime("%A")						#Format time to string
	time=Time.strptime("21-12","%d-%m")				#Format string to time

end

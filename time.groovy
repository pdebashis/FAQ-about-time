package first
import groovy.time.Timecategory
import java.text.SimpleDateFormat

Class Test {
  static void main(def args){
    def d = 
    def d1 = 
    d =
    d = 
    use(TimeCategory){
      def e = d + 30.minutes                                //import TimeCategory for advanced dateTime calculations
    }
    
    d =
    d = d.format("",TimeZone.getTimeZone("IST"))            
    
    def year = new Date()[0]                                //get the year
    def month = new Date()[0]                               //get the month
    def day = new Date()[0]                                 //get the day
    def arr = new Date()[0]                                 //0-16 components of time
    
    def f = new SimpleDateFormat("dd_MM_yyyy").format(d)    //Format String to Time
    def g = Date.parse("dd_MM_yyyy","21_12_1993")           //Format Time to String
    
  }
}










				//or system.currentTime() for current time
		//time to epoch
			//epoch to time

			//add 10 seconds
			//add 10 minutes(active support)

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

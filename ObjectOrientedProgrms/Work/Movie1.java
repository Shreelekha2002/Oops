public class Movie1{
//reference way
static String movie_name;
static long release_date;
static String producer_name;
static String hero_name;
static String heroin_name;
static int no_of_artists;
static float movie_time;
static String prerelease_event_place;
static int prerelease_event_date;
static String prerelease_event_guest;
static float rating;
static int ticket_price;

public static void main(String args[]){
	movie_name="Bhagavanth kesari";
	release_date=2023;
	producer_name="Kumar Taurani";
	hero_name="Bhalakrishna";
	heroin_name="Kajal";
	no_of_artists=2;
	movie_time=2.9f;
	prerelease_event_place="Hyderabadh";
	prerelease_event_date=2023;
	prerelease_event_guest="Modhi";
	rating=10;
	ticket_price=250;

		System.out.println("Movie name is:"+Movie1.movie_name);
		System.out.println("Movie release date:"+Movie1.release_date);
		System.out.println("Movie producer name is:"+Movie1.producer_name);
		System.out.println("Movie hero name is:"+Movie1.hero_name);
		System.out.println("Movie heroin name is:"+Movie1.heroin_name);
		System.out.println("Movie artists:"+Movie1.no_of_artists);
		System.out.println("Movie running time is:"+Movie1.movie_time);
		System.out.println("Movie prerelease event place is:"+Movie1.prerelease_event_place);
		System.out.println("Movie prerelease event date is:"+Movie1.prerelease_event_date);
		System.out.println("Movie prerelease event guest is:"+Movie1.prerelease_event_guest);
		System.out.println("Movie rating is:"+Movie1.rating);
		System.out.println("Movie ticket price is:"+Movie1.ticket_price);


}

}
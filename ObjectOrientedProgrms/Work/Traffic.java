public class Traffic{
static int signaltime;
static char id;
static float greentime;
static float redtime=3.4f;
static char signallight='G';
static boolean trafficmore;
static long policeNo=98;
static short policeid=208;
static String policename="Shree";
static String signalplace="Kolar";

public static void main(String args[]){

System.out.println("Signal time in sec:"+Traffic.signaltime+" "+
"ID:"+Traffic.id+" "+
"Greensignal:"+Traffic.greentime+" "+
"Signal redtime:"+Traffic.redtime+" "+
"Signal light:"+Traffic.signallight+" "+
"Traffic is more:"+Traffic.trafficmore+" "+
"Polic number:"+Traffic.policeNo+" "+
"PolicId:"+Traffic.policeid+" "+
"Policename:"+Traffic.policename);
System.out.println("Signal place:"+Traffic.signalplace);

}
}


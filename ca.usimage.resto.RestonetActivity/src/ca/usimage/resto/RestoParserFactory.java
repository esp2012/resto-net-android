package ca.usimage.resto;

import ca.usimage.resto.AndroidSaxParser;




public abstract class RestoParserFactory {
//	static String feedUrl = "http://www.androidster.com/android_news.rss";
	//static String feedUrl = "http://androidster.net/feed";
	//static String feedUrl = "http://thibault-koprowski.fr/feed";
//	static String feedUrl = "http://ville.montreal.qc.ca/pls/portal/portalcon.contrevenants_recherche?p_mot_recherche=,tous.2011";
	static String feedUrl = "http://depot.ville.montreal.qc.ca/inspection-aliments-contrevenants/data.xml";
	public static RestoParser getParser() {
		
				return new AndroidSaxParser(feedUrl);
	
		
		}
	}



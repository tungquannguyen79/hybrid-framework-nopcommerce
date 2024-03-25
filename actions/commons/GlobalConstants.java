package commons;

import java.io.File;

public class GlobalConstants {
	public static  final String PORTAL_PAGE_URL = "https://demo.nopcommerce.com/";
	public static  final String ADMIN_PAGE_URL = "https://admin-demo.nopcommerce.com";
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	//Windown  - Mac - Linux
	public static final String UPLOAD_FILE =  PROJECT_PATH + File.separator + "/uploadFiles";
	public static final String DOWNLOAD_FILE = PROJECT_PATH + File.separator + "/downloadFiles";
	public static final String BROWSER_LOG = PROJECT_PATH + File.separator + "/browserLogs";
	public static final String DRAP_DROP_HTML5 = PROJECT_PATH + File.separator + "/dragDropHTML5";
	public static final String AUTO_IT_SCRIPT = PROJECT_PATH + File.separator + "/autoIT";
	
	// Database Account / User / Pass / Port
	public static final String DB_DEV_URL ="";
	public static final String DB_DEDV_USER ="";
	public static final String DB_DEDV_PASS ="";
	
	public static final long SHORT_TIMEOUT = 5;
	public static final long LONG_TIMEOUT = 30;
	public static final long NUM_RETRY_TEST_FAIL = 3;
	

}

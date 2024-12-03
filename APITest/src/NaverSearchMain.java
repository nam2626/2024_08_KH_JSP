import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class NaverSearchMain {

	public static void main(String[] args) {

	}
	
	public static String naverNewsSearch(String text) {
		String clientId = "애플리케이션 클라이언트 아이디"; 
        String clientSecret = "애플리케이션 클라이언트 시크릿";

		String result = "";
		try {
			//0. 보낼 데이터를 인코딩 - UTF-8
			text = URLEncoder.encode(text, "UTF-8");
			//1. URL 셋팅 - 쿼리 스트링도 적용
			String apiURL = "https://openapi.naver.com/v1/search/news.json?query=" + text;    // JSON 결과
			//2. URL 생성 및 Connection 생성 
			URL url = new URL(apiURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			//3. Connection 설정
			//	헤더 설정 -> 인증 정보 (클라이언트 키캆, 시크릿 값, API 키값)
			//	Method 설정
			conn.setRequestMethod("GET");
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}




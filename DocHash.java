import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;



public class DocHash {

	
public String docHash;
    
    public String getHash(String originalText ) throws NoSuchAlgorithmException {
    	
    	
    	
    	
    	 MessageDigest digest = MessageDigest.getInstance("SHA-256");
byte[] hash = digest.digest(originalText.getBytes(StandardCharsets.UTF_8));

//to convert digest to base64 encoded string

docHash = Base64.getEncoder().encodeToString(hash);

//to convert digest to base16 encoded string - to be added later


    	 

    
    return docHash;
    }
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub

DocHash docH = new DocHash();
    	
    	System.out.println ("Hashed value of entered text is: " + docH.getHash("ukcbcmultic1"));
	
	}

	
	
}

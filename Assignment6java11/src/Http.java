import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create a client
        HttpClient client = HttpClient.newHttpClient();

        // Create a request
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://httpbin.org/get"))
            .GET()
            .build();

        // Send the request and get the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print the response headers
        System.out.println("Response headers:");
        response.headers().map().forEach((key, values) -> values.forEach(value -> System.out.println(key + ": " + value)));

        // Print the status code
        System.out.println("Status code: " + response.statusCode());

        // Print the response body
        System.out.println("Response body:");
        System.out.println(response.body());
    }
}
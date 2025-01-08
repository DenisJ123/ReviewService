package ie.atu.notificationservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @PostMapping
    public ResponseEntity<String> sendNotification(@RequestParam String message) {
        System.out.println("Notification sent: " + message);
        return ResponseEntity.ok("Notification sent successfully.");
    }
}

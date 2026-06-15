package DesignPatterns.Exercise05;
public class DecoratorTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier allChannelsNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);
        System.out.println("Scenario 1: Sending notification via Email only:");
        emailNotifier.send("System updates completed!");
        System.out.println("Scenario 2: Sending notification via Email + SMS:");
        smsAndEmailNotifier.send("Emergency alert: Server down!");
        System.out.println("Scenario 3: Sending notification via Email + SMS + Slack:");
        allChannelsNotifier.send("Monthly report is ready!");
    }
}

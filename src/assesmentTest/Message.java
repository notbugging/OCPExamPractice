package assesmentTest;

public abstract class Message {
	public String recipient;
	public abstract final void sendMessage();
	
	public static void main(String[] args) {
		Message m = new TextMessage();
		m.recipient = "1234567890";
		m.sendMessage();
	}
	
	static class TextMessage extends Message {

		@Override
		public final void sendMessage() {
			System.out.println("Text message to " + recipient);
		}
	}
}

//A method is not allowed to be both abstract and final
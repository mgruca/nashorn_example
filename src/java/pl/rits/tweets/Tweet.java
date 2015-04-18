package pl.rits.tweets;

public class Tweet {
	public String body;
	public String userName;

	public Tweet(final String body, final String userName) {
		this.body = body;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Tweet{" +
				"body='" + body + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}

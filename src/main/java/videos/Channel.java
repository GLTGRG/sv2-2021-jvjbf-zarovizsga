package videos;

public class Channel {

    private String ChannelName;
    private int subscriptions;
    private int numberOfVideos;

    public Channel(String channel, int subscriptions, int numberOfVideos) {
        this.ChannelName = channel;
        this.subscriptions = subscriptions;
        this.numberOfVideos = numberOfVideos;
    }

    public String getChannelName() {
        return ChannelName;
    }

    public int getSubscriptions() {
        return subscriptions;
    }

    public int getNumberOfVideos() {
        return numberOfVideos;
    }
}

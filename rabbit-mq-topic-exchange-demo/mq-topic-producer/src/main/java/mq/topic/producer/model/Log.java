package mq.topic.producer.model;

public class Log {
	private String content;
	private String routingKey;
	
	public Log(){};
	
	public Log(String content, String routingKey){
		this.content = content;
		this.routingKey = routingKey;
	}
	
	public String getContent(){
		return this.content;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public String getRoutingKey(){
		return this.routingKey;
	}
	
	public void setRoutingKey(String routingKey){
		this.routingKey = routingKey;
	}
	
	@Override
	public String toString() {
		return String.format("{content = %s, routingKey = %s}", content, routingKey);
	}
}
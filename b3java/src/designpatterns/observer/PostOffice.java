package designpatterns.observer;
import java.util.ArrayList;

public class PostOffice implements Subject
{

	private ArrayList<Passport> allMail;
	private ArrayList<Observer> observers_Subscribers_list;

	public PostOffice()
	{
		allMail = new ArrayList<>();
		observers_Subscribers_list = new ArrayList<>();
	}

	public void addMail(Passport pp){
		allMail.add(pp);
		notifySubscribers();
	}

	public ArrayList<Passport> getState()
	{
		return allMail;
	}

	public void subscribe(Observer o)
	{
		observers_Subscribers_list.add(o);
	}

	public void unSubscribe(Observer o)
	{
		observers_Subscribers_list.remove(o);
	}

	public void notifySubscribers()	{
		
		for (int i = 0; i < observers_Subscribers_list.size(); i++)
			observers_Subscribers_list.get(i).update(this);
	}
}
import javax.swing.JOptionPane;

public class JavaLibs5026211152 {
	public static void main(String[] args){
	JOptionPane.showMessageDialog(null, "Welcome, Player!  in this game called Man Simulator", "Man Simulator V.0.1", 1);
        JOptionPane.showMessageDialog(null, "This is a game where you create a story by filling in the input to make the story interesting!", "Man Simulator V.0.1", 1);
        JOptionPane.showMessageDialog(null, "Type the correct type! don't write sentences or words in age or don't write numbers in your name and so on.", "Man Simulator V.0.1", 1);
        JOptionPane.showMessageDialog(null, "Be ready! The game will start now!", "Man Simulator V.0.1", 2);
        String yourName = (String)JOptionPane.showInputDialog(null, "First, What is your male character's name ?", "Man Simulator V.0.1", 3, null, null, "Type your answer here");
        int yourAge = Integer.parseInt((String) JOptionPane.showInputDialog(null, "How old is your character ?", "Man Simulator V.0.1", 3, null, null, "Type your answer here"));
        double yourMoney = Double.parseDouble((String) JOptionPane.showInputDialog(null, "How much money does your character have ?", "Man Simulator V.0.1", 3, null, null, "Type your answer here"));
        String yourJob = (String)JOptionPane.showInputDialog(null, "Today is his first day on his newly acquired job. And the job is ?", "Man Simulator V.0.1", 3, null, null, "Type your answer here");
        JOptionPane.showMessageDialog(null, yourName + " eats some breakfast and takes a shower.", "Man Simulator V.0.1", 2);
        String yourTransportation = (String)JOptionPane.showInputDialog(null, "When he's done, he goes to his garage and he sees his vehicle. What's his vehicle ?", "Man Simulator V.0.1", 3, null, null, "Type your answer here");
        JOptionPane.showMessageDialog(null, yourName + " then rides his " + yourTransportation + " to his office.", "Man Simulator V.0.1", 2);
        double gasPrice = Double.parseDouble((String) JOptionPane.showInputDialog(null, "In the middle of his journey, he goes to the gas station. He then fills his gas which ultimately costs ?", "Man Simulator V.0.1", 3, null, null, "Type your answer here"));
        yourMoney = yourMoney - gasPrice;
        JOptionPane.showMessageDialog(null, yourName + " then pays the gas price. if he doesn't have enough money, he will come back later to give the remaining money. So, now he has $" + yourMoney);
        JOptionPane.showMessageDialog(null, "From the gas station, he continues his journey, but something happened again. He is now stopped by the police.", "Man Simulator V.0.1", 2);
        int yourNumber = Integer.parseInt((String) JOptionPane.showInputDialog(null, "The police apologizes for stopping him because he want's to check if he's drunk or not. The police then asks to pick a number. What will it be ?", "Man Simulator V.0.1", 3, null, null, "Type your answer here"));
        int theNumAnswer = yourNumber + 7;
        JOptionPane.showMessageDialog(null, yourName + " picks number " + yourNumber + ". The police then asks about what's the result of your number plus 7. " + yourName + " answers " + theNumAnswer, "Man Simulator V.0.1", 2);
        JOptionPane.showMessageDialog(null, "The police nods and he lets " + yourName + " go. ", "Man Simulator V.0.1", 2);
        double tollPrice = Double.parseDouble((String) JOptionPane.showInputDialog(null, "The journey continues. " + yourName + " decided that it's best to use the toll. He looks at the toll price which is?", "Man Simulator V.0.1", 3, null, null, "Type your answer here" ));
        yourMoney = yourMoney - tollPrice;
        JOptionPane.showMessageDialog(null, yourName + " takes his credit card and swipes it to pay the toll. The monitor then shows his remaining cash which shows $" + yourMoney, "Man Simulator V.0.1", 2);
        JOptionPane.showMessageDialog(null, "The toll gate opens and " + yourName + " quickly drives in the toll road.", "Man Simulator V.0.1", 2);
        String yourCondition = (String) JOptionPane.showInputDialog(null, "After a long trip, he finally arrives at his office. He then goes to his desk and gets greeted by his friend. His friend asks \"how are you?\"", "Man Simulator V.0.1", 3, null, null, "Type your answer here");
        JOptionPane.showMessageDialog(null, yourName + " replies \"" + yourCondition + "\". His friend then nods and says \"alright, see you later, gotta continue my work\".", "Man Simulator V.0.1", 2);
        int yourYear = Integer.parseInt((String) JOptionPane.showInputDialog(null, "After some time working, you see your supervisor coming. \"Good day, what year is it ?\"", "Man Simulator V.0.1", 3, null, null, "Type your answer here"));
        JOptionPane.showMessageDialog(null, "The supervisor laughs and say \"Yeah right it's " + yourYear + " right now. Time flies yeah ?" + yourName + " replied \"Yup\" and nods", "Man Simulator V.0.1", 2);
        JOptionPane.showMessageDialog(null, "The supervisor then says \"Well then, welcome! i hope you'll have a good time working here. Oh, and call me if  you need help\"", "Man Simulator V.0.1", 2);
        JOptionPane.showMessageDialog(null, "You reached the end. For now... Thanks for playing and we hope you have a pleasant time playing this game!");
	 
	}
}
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        String temp;
        temp = JOptionPane.showInputDialog(null, "Enter the team either1 or 2");
        int team = Integer.parseInt(temp);
        if (team == 1) {

            JPasswordField movie_name= new JPasswordField();
            JOptionPane.showConfirmDialog(null,movie_name,"Enter the movie name",JOptionPane.OK_CANCEL_OPTION);
            String movie= new String(movie_name.getPassword());

            JPasswordField hint1=new JPasswordField();
            JOptionPane.showConfirmDialog(null,hint1,"Enter the hint 1", JOptionPane.OK_CANCEL_OPTION);
            String hint1ans= new String(hint1.getPassword());


            JPasswordField hint2=new JPasswordField();
            JOptionPane.showConfirmDialog(null,hint2, "Enter hint 2",JOptionPane.OK_CANCEL_OPTION);
            String hint2ans=new String(hint2.getPassword());

            JPasswordField hint3= new JPasswordField();
            JOptionPane.showConfirmDialog(null,hint3, "Enter hint 3",JOptionPane.OK_CANCEL_OPTION);
            String hint3ans=new String(hint3.getPassword());

            JOptionPane.showMessageDialog(
                    null,
                    "Here are your hints:\n" + new String(hint1.getPassword()) + "\n" + new String(hint2.getPassword()) + "\n" + new String(hint3.getPassword())
            );

            JOptionPane.showMessageDialog(null, "HI Team 2 you need to guess the movie, you have 3 attempts to guess the movie");
            String attempt1;
            attempt1 = JOptionPane.showInputDialog(null, "Enter the guess 1");
            String attempt1ans = attempt1;
            if (attempt1ans.equals(movie)) {
                JOptionPane.showMessageDialog(null, "hurray you guessed it right");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Oh not a match  You still have 2 attempts");
            }
            System.out.println(attempt1ans);
            // attempt 2
            //JOptionPane.showMessageDialog(null, "HI TEAm 2 you need to guess the movie, you have 2 attempts to guess the movie");
            String attempt2;
            attempt2 = JOptionPane.showInputDialog(null, "Enter the guess 2");
            String attempt2ans = attempt2;
            if (attempt2ans.equals(movie)) {
                JOptionPane.showMessageDialog(null, "hurray you guessed it right");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Oh not a match You still have 1 attempts");
            }

            // attempt 3
            //JOptionPane.showMessageDialog(null,"HI TEAm 1 you need to guess the movie, you have 1 last attempts to guess the movie");
            String attempt3;
            attempt3=JOptionPane.showInputDialog(null,"Enter the guess 3");
            String attempt3ans=attempt3;
            if(attempt3ans.equals(movie))
            {
                JOptionPane.showMessageDialog(null,"hurray you guessed it right");
                System.exit(0);
            }

            else {
                JOptionPane.showMessageDialog(null,"Oh not a match You still have 0 attempts left");
                JOptionPane.showMessageDialog(null,"the movie was "+movie);
            }


        }

     else if(team==2) {

            JPasswordField movie_name= new JPasswordField();
            JOptionPane.showConfirmDialog(null,movie_name,"Enter the movie name",JOptionPane.OK_CANCEL_OPTION);
            String movie= new String(movie_name.getPassword());

            JPasswordField hint1=new JPasswordField();
            JOptionPane.showConfirmDialog(null,hint1,"Enter the hint 1", JOptionPane.OK_CANCEL_OPTION);
            String hint1ans= new String(hint1.getPassword());


            JPasswordField hint2=new JPasswordField();
            JOptionPane.showConfirmDialog(null,hint2, "Enter hint 2",JOptionPane.OK_CANCEL_OPTION);
            String hint2ans=new String(hint2.getPassword());

            JPasswordField hint3= new JPasswordField();
            JOptionPane.showConfirmDialog(null,hint3, "Enter hint 3",JOptionPane.OK_CANCEL_OPTION);
            String hint3ans=new String(hint3.getPassword());

            JOptionPane.showMessageDialog(
                    null,
                    "Here are your hints:\n" + new String(hint1.getPassword()) + "\n" + new String(hint2.getPassword()) + "\n" + new String(hint3.getPassword())
            );

            JOptionPane.showMessageDialog(null, "HI Team 1 you need to guess the movie, you have 3 attempts to guess the movie");
            String attempt1;
            attempt1 = JOptionPane.showInputDialog(null, "Enter the guess 1");
            String attempt1ans = attempt1;
            if (attempt1ans.equals(movie)) {
                JOptionPane.showMessageDialog(null, "hurray you guessed it right");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Oh not a match  You still have 2 attempts");
            }
            System.out.println(attempt1ans);
            // attempt 2
            //JOptionPane.showMessageDialog(null, "HI TEAm 2 you need to guess the movie, you have 2 attempts to guess the movie");
            String attempt2;
            attempt2 = JOptionPane.showInputDialog(null, "Enter the guess 2");
            String attempt2ans = attempt2;
            if (attempt2ans.equals(movie)) {
                JOptionPane.showMessageDialog(null, "hurray you guessed it right");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Oh not a match You still have 1 attempts");
            }

            // attempt 3
            //JOptionPane.showMessageDialog(null,"HI TEAm 1 you need to guess the movie, you have 1 last attempts to guess the movie");
            String attempt3;
            attempt3=JOptionPane.showInputDialog(null,"Enter the guess 3");
            String attempt3ans=attempt3;
            if(attempt3ans.equals(movie))
            {
                JOptionPane.showMessageDialog(null,"hurray you guessed it right");
                System.exit(0);
            }

            else {
                JOptionPane.showMessageDialog(null,"Oh not a match You still have 0 attempts left");
                JOptionPane.showMessageDialog(null,"the movie was "+movie);
            }


        }
    }
}
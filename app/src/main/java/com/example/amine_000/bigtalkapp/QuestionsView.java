package com.example.amine_000.bigtalkapp;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.res.AssetManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.amine_000.bigtalkapp.adapters.QuestionAdapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class QuestionsView extends ListActivity {
    ArrayList<String> questionsList = new ArrayList<String>();
    String[] myList = {"What don't you spend enough time doing?", "What do you spend too much time doing?", "What is something new you have recently tried?", "What do you stand for?", "What is a common misconception that people may have about you?", "What will you want to have accomplished when you are 100 years old?", "What is your greatest strength?", "Describe something that you did that you didn't think you could do", "What do you wish more people knew about you?", "What was the most impactful event in your life?", "What is the last risk you took that you were happy about?", "What is a new habit you want to form?", "What piece of advice would you offer a newborn infant?", "What were you experiencing the last time you remember crying?", "What does this world need more of?", "What matters to you and why? ", "What things hold you back from doing the things you really want to do?", "When do you feel most afraid?", "Describing a turning point in your life.", "What have you done that you are most proud of?", "What is something you know you do differently than most people?", "What is your next great adventure?", "How happy are you?", "What is one thing that could happen today that would make you happier?", "What does success mean to you?", "Can you define true love?", "What does happiness mean to you?", "What are some things you are scared of losing?", "What is the purpose of your life?", "Has there ver been a time where you felt like life couldn't go on?", "What inspires you?", "Is there anything in this would you would die for?", "What do you want to do before you die?", "Do you have any regrets in life?", "What are you committed to?", "What gives you hope?", "What impact do you have on the world?", "What do you enjoy?", "What do you want to be remembered for?", "What have you been thinking about lately?", "What do you dream about?", "What is the hardest thing you ever had to do?", "If you knew you were going to die tomorrow, how would you spend today?", "How do you feel about your relationship with your mother?", "For what in your life are you most grateful?", "What would constitute a perfect day for you?", "Would you like to be famous? In what way?", "When did you last cry in front of someone? By yourself?", "What object would you save if your house was on fire?", "What advice would you give to yourself 5 years ago?", "What is the most beautiful thing you have ever seen with your own eyes", "What is your number one priority today?", "Who do you need to get in touch with because it's been too long?", "When did you last talk yourself out of something when deep down you wanted to do it?", "How do Mondays feel for you?", "What advice would you ask for from your greatest hero (dead or alive)", "If you had one year left to live, how would you spend it?", "What aspects of you, do you keep hidden from friends but expose to loved ones?", "What makes you special?", "What does your perfect day look like?", "Do you want your children (if you have any) to be like you?", "What do you consistently attract in your life that is no longer good enough for you?", "Are you making any difference in the world?", "If money were no concern, what would you do for the rest of your life?", "What are you thankful for, this very moment?", "What's your earliest memory of achievement?", "If you could talk to everyone in the world for 5 minutes, what would you say?", "What is one of the kindest  things someone has ever done for you?", "What is the kindest thing you have ever done for someone else?", "Who in this world do you love most and what are you doing about it?", "Whose life do you believe you've had the biggest impact on?", "What is home to you?", "Is there anybody in your life that you would like to forgive, but haven't?", "Is there anybody in your life you want to ask for forgiveness from?", "What do you wish you knew?", "When was the last time you lied? Why?", "What is the most spontaneous thing you've ever done?", "What have you witnessed that has strengthened your faith in humanity?", "What have you witnessed that has weakened your faith in humanity?", "What have you done lately that's worth remembering?", "How are you really doing?", "Do you like who you are?", "What would people say about you at your funeral? What would you want them to say?", "What lessons in life did you learn the hard way?", "What brings you down the most often?", "Where do you find peace?", "What does success mean to you?", "Do the people you love most know how much you love them?", "Based on your current day-to-day life, what do you expect to achieve in 5 years from now?","Do you say yes too often when you really want to say no? Why?","What did you learn yesterday?", "Do you really listen to people when they talk to you?", "Are there certain things in life that you feel are too late to do? Why?", "What causes you stress?", "Are you afraid to speak your own opinion about something?", "Do the people in your life bring out the best in you?", "What one thing is standing between you and your biggest goal right now?", "What could you pay more attention to in life?", "What have you given up on?", "What were you doing the last time you lost track of time?","How old would you be if you didn't know how old you are and why?", "Why do you do what you do?", "For who or what do you work for?", "What makes you sad?", "What or who do you need to stay away from?", "What do you do when you are alone?", "What are the worst feelings in the world and why?", "Do you think you are a good person?", "What thing do you wish you owned?", "What holds you back from telling your deepest secret?", "Do you fit in or stand out? How so?", "How would you live life differently if you could never die?", "What do you value that doesn't cost money?", "Is there anybody you are jealous of? Why? ", "What non-physical traits do you find attractive in another human being?", "What is the meaning of life?", "Describe paradise. ", "Describe a first in your life", "Describe a time you lost.", "What do you think about when you first wake up?", "What is the best descision you ever made?", "What are the first things you notice about someone when meeting them for the first time?", "What do you miss from childhood?", "Is there anything you wish you didn't know?", "Who gave you the best advice you ever received and what was it?", "What is the best gift that someone can give you?", "What is the worst thing you have done to somebody else?", "What are you guilty of?", "What can you do today that you could not do a year ago?", "Have you done anything lately worth remembering forever?", "What makes you smile?", "If karma was objectively real, would it help you or harm you?", "If you had the chance to go back in time and change one thing, what would you change?", "What do you have that you cannot live without?", "When you think of home, what do you think of?", "What are you looking forward to?", "Where would you like to live? Why haven't you moved?", "If you had 24 hours to live, who would you be with 23 hours from now?", "When did you not speak up when you should have?", "Where would you like to wake up tomorrow?", "How far back do you know about your heritage", "What was the best compliment you ever received?", "Is there anyone you would trust with your life?", "Do you get along with your family? Why or why not?", "What is a question you hate to answer?", "What cheers you up?", "How do you feel about birthdays?", "Do you know who you are?", "What is something weird about you? Are you proud of it?", "Have you ever been in love?", "How do you know you love someone?", "Name the most scary moment of your life so far?", "What makes you, you?", "When was the last time you were really angry?", "When was the last time you told someone you loved them and really meant it?", "What do you miss?", "What is one question you would ask a fortuneteller?", "What do you admire about yourself?", "What embarasses you? ", "What makes you uncomfortable?", "What makes you comfortable?", "If you could freeze time, what would you do? ", "Would you allow yourself to fall in love with someone you knew you couldn't possibly ever marry?", "What is your greatest fault and what can you start doing right now to fix it?", "How do you define your own sexuality?", "What are the little things in life that you take the time to stop and appreciate?", "What have you started, but never finished and why? ", "What makes you feel really alive?", "Are you the kind of friend you would want to have as a friend?", "Are you healthy? Mentally? Physically?", "If you were a different gender, what would you do differently? ", "What life lesson do you wish everyone was taught in school? ", "What is your most common emotional state and why?", "Is there anybody in your life that you admire? Why? ", "What can people learn from you? ", "Who do you love and who loves you? ", "If nobody judged you, who would you be?", "If you were missing an arm or lef, how would your life be different?", "If you could run and create a new country, what would it be like?", "What is one thing you will never do again?", "What happened the last time in your life you were very nervous to do something?", "Outside of your family, who knows you the best?", "What has been your favorite age so far and why?", "What thing would you be most disappointed about if you never got to experience it?", "What is a weird quirk your family has?", "What are your darkest thoughts?", "What constantly worries you?", "What question do you wish you could ask anybody?", "Describe a time you felt hopeless.", "What should people do more of?", "Who do you trust?", "What has been your greatest sacrifice?", "If you had to choose the way you were going to die, what would it be?", "If your friends were describing you in a few sentences, what would they say?", "What do you fight for? ", "Why were you born?", "What do you want in a life companion?", "What motivates you?", "Are there people in your life that bring you down? ", "If you were to leave the world today, what would your manifesto be?", "What makes you lose track of time?", "What gives you goosebumps?", "What makes you cry?", "What does your eptitaph say?", "What are your thoughts on love, sex, and marriage?", "Describe a time you showed true strength. ", "Do you feel in control of your life? Why/why not? ", "How do you tell right from wrong?", "What do you avoid?", "What are you curious about?", "What do you secretly desire?"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_view);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, myList);
        //setListAdapter(adapter);

        //using custom adapter
        QuestionAdapter adapter = new QuestionAdapter(this,myList);
        setListAdapter(adapter);
    }

    public ArrayList<String> returnArray(){
        ArrayList<String> questionsArray = new ArrayList<String>();
        Scanner in;
        File myFile = new File("C:\\Users\\amine_000\\Documents\\BigTalkApp\\app\\src\\main\\assets\\questions.txt");
        //InputStream inStream = (Activity)getContext().getAssets().open("questions.txt");
        try {
            in = new Scanner(myFile);
            while(in.hasNextLine()){
                String line = in.nextLine();
                questionsArray.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found ayyy");
        }
        return questionsArray;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_questions_view, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case R.id.action_add:
                Context context = getApplicationContext();
                CharSequence text = "Adding item";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();
                return true;
            case R.id.action_settings:
                Context context1 = getApplicationContext();
                CharSequence text1 = "Settings has been opened";
                int duration1 = Toast.LENGTH_SHORT;
                Toast.makeText(context1, text1, duration1).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

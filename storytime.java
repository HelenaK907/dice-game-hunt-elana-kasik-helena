package adventurestory;

import java.util.Scanner;

public class storytime {


	public static void main(String[] args) {
		Scanner storytime = new Scanner(System.in);
		System.out.println("Welcome to our adventure story! \n"
				+ "Have fun!");
		System.out.println("You wake up to the sound of the outro of Pewdiepie newest minecraft video. \nYou realize you fell asleep watching youtube again. \nIf only you could be as famous as him, but you only get 15 views per video.\nDo you:");
		System.out.println("1. You go about your normal routine, before making another video");
		System.out.println("2. send pewdiepie an email for the 50th time, asking for a collab?");
		int option = storytime.nextInt();
		if (option == 1)
		{
			System.out.println("you make the video and check the comments from your previous.The hate comments are so strong you die of embarrassment.\n"
					+ "THE END");
		}
		else
		{
			System.out.println("You put pour your heart and soul into this email, and then take a shower. \nWhen you get out, you have a new notification from your gmail account. He finally responded!\n Do you:\n1.open the email immediately \n2. wait 15 minutes to act busy");
			option = storytime.nextInt();
			if (option==1){
				System.out.println("\" How's it going bro! you have officially been invited to my wedding at 12:30 pm! \n I can't wait to meet you!\"");
				System.out.println("You check your watch, its 11:45!  YOu rush to find your best dress clothes, and brush your teeth. you..look..stunning! \n You rush out the door and start to drive to the venue  ");
				System.out.println("You arrive at the venue with just enough time to find seats. To your left is Markiplier, Jacksepticeye, and Cinnamon Toast Ken all chatting about the newest update to slime rancher. To your right you see a crying woman. \nyou go:");
				System.out.println("1. to your left\n2.to your right");
				option = storytime.nextInt();
				if (option==1){
					System.out.println("You join in the conversation, adding interesting points, and exchange info for a future collab. you have just enough time to make it to your seats. After the wedding you go to the reception and finally meet up with pewdiepie. \nDo you:");
				}else{
		}           System.out.println("You go over and try to comfort the crying woman and you find out its Trisha Paytas! she is upset because there are no chicken tenders at the wedding, and she wanted to do a mukbang. she stops crying for long enough to ask you if you want to raid the kitchen at the reception and do a mukbang.\n do you:");
		        	System.out.println("1.convince her to sit down and enjoy the wedding\n 2.go with her ");
			}
			else{
				System.out.println("\" How's it going bro! you have officially been invited to my wedding at 12:30 pm! \n I can't wait to meet you!  \"");	
				System.out.println("you check your watch, its 12:00!  You rush to find a clean shirt, and brush your teeth. you look..eh. \n You rush out the door and start to drive to the venue.");
				System.out.println("You arrive at the venue to see some of your favorite creators.You look to your left, and see: Markiplier, jacksepticeye, and Cinnamon Toast Ken are all chatting in the corner about the newest update to slime rancher. You look to your right and see a crying woman in the corner. /nYou go:");
				System.out.println("1. to your left\n2.to your right");
				option = storytime.nextInt();
				if (option==1){
				System.out.println("you join in the conversation, adding interesting points.After the wedding you go to the reception and finally meet up with pewdiepie. Do you:");
				}else{
					System.out.println("You sit down and try to comfort the crying woman and you find out its Trisha Paytas! she is upset because there are no chicken tenders at the wedding, and she wanted to do a mukbang. she stops crying for long enough to ask you if you want to raid the kitchen at the reception and do a mukbang. /ndo you: ");
					System.out.println("1.don't go with her\n 2.go with her ");
					option = storytime.nextInt();
					if (option == 1){
						 System.out.println("You enjoy the rest of the wedding, and head to the reception, and sit down at the table when all of a sudden T-Series is stealing their presents! OH NO! \n Do you:");
						System.out.println("1. Tell someone that T-series is stealing \n 2. Help take some of the presents cause your broke sis");
						option = storytime.nextInt();
						if (option == 1){
							 System.out.println("You turn around and see Mariza and tell her that T-Series is stealing. They kick T-Series out and thank you for informing her. You continue the party and exchange numbers to collab in the future! Your collab gets over 4 MILLION Views!! \nTHE END");

							} else{
							 System.out.println("You join in with T-Series and Mariza catches you. She screams in horror!/n \"Oh NO someone stop them! \" The family members throw you out of the wedding. \n THE END");

							}

					} else{
						 System.out.println("You follow Trishia to the kitchen, and raid their stash of junk food. You set up the camera and start to film the mukbang. \nYour half way through when the chef shows up! \n do you:");
						 System.out.println("1. Blame it on her \n 2. Share the blame");
							option = storytime.nextInt();
						 if (option == 1){
							 System.out.println("You tell the chef that you were trying to stop her. The chef thanks you for your honesty and tells you to head to the reception");
							 System.out.println("You head to the reception and they start serving food! The server asks if you want some scallops. \n Do you:");
							 System.out.println("1. Take the scallops even though your allergic\n2. Decline the seafood"); 
							 option = storytime.nextInt();
							 if (option == 1){
								 System.out.println("You eat the scallops and immediately start to blow up like a balloon! Pewdiepie comes up to talk to you but you cannot speak. \nHe realizes you’re having an allergic reaction and sends you to the hospital. You never got his information to collab. \n THE END");
								 
								} else{
								 System.out.println("You kindly decline the seafood and the waiter leaves. Soon you get on to talk to pewdiepie and exchange information to collab on a minecraft video. It gets 10 million views! /nTHE END");

								}

							} else{
							 System.out.println("You tell the chef that both of you were responsible and the chef kicks you out of the wedding. After spending a night in jail, Trishia invites you to collab on her channel, which brings your view count up to 45 views. \nTHE END");

							}


						}

				}
			}
	}
} }




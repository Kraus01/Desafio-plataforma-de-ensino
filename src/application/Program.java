package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Lesson;
import entities.Task;
import entities.Video;


public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Lesson> lesson = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Dados da " + i +"a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)?");
			sc.nextLine();
			char taskContent = sc.next().charAt(0);
			System.out.print("Título:");
			sc.nextLine();
			String title = sc.nextLine();
			if (taskContent == 'c') {
				System.out.println("URL do vídeo:");
				String url = sc.next();
				System.out.println("Duração em segundos: ");
				int duration = sc.nextInt();
				lesson.add(new Video(title, url, duration));
			} else  {
				System.out.print("Descrição: ");
				String descrition = sc.next();
				System.out.print("Quantidade de questões:");
				sc.nextLine();
				int questionCount = sc.nextInt();
				lesson.add(new Task(title, descrition, questionCount));
			}
			System.out.println();
			
		}
		
		System.out.println();
		int totalCourseDuration = 0;
		for (Lesson list : lesson) {
			totalCourseDuration += list.duration();
			
		}
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalCourseDuration + " segundos");
		
	
		
		
		
		
		
		
		sc.close();
	}

}

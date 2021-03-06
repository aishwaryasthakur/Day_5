package com.training;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

import com.training.models.Doctor;
import com.training.models.Hospital;
import com.training.models.Patient;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Patient> patients;
		Iterator<Patient> iterator;
		
		Hospital sahayadri = new Hospital("Sahayadri", "Pune", 778888);
		
		Doctor aishwarya = new Doctor("Aishwarya", "heart specialist");
		Doctor madhura = new Doctor("Madhura", "gynecologist");
		
		sahayadri.appointDoctor(aishwarya);
		sahayadri.appointDoctor(madhura);
		
		HashSet<Doctor> doctors = sahayadri.getDoctors();
		Iterator iter = doctors.iterator();
		while(iter.hasNext()){
	        System.out.println(iter.next().toString());
	     }
	     System.out.println("---");
	     
		Patient madhavi = new Patient("madhvi", 4, "female");
		Patient abc = new Patient("bhagyashree", 4, "female");
		
		sahayadri.setAppointment(aishwarya, madhavi);
		sahayadri.setAppointment(aishwarya, abc);
		

		sahayadri.setAppointment(madhura, abc);
		sahayadri.setAppointment(madhura, madhavi);
		
		patients = sahayadri.getPatients("Aishwarya");
		iterator = patients.iterator();
		while(iterator.hasNext()){
	        System.out.println(iterator.next().getPatientName());
	     }
	     System.out.println("---");
		
		patients = sahayadri.getPatients("Madhura");
		iterator = patients.iterator();
		while(iterator.hasNext()){
	        System.out.println(iterator.next().getPatientName());
	     }
	     System.out.println("---");
	     patients = sahayadri.cancelAppointment(aishwarya, abc);
	     
		 iterator = patients.iterator();
		 while(iterator.hasNext()){
		        System.out.println(iterator.next().getPatientName());
		     }
	}

}

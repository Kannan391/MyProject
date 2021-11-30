package com.propread;

public class File_Read_Manager {
		
		private File_Read_Manager() {
			// To restrict obj creation for file reader manager
		}
		
		public static File_Read_Manager getInstanceFRM() {
	    
			File_Read_Manager frm = new File_Read_Manager();
			
			return frm;
			
		}
		
	  public Conf_Reader getInstanceCR() throws Throwable {
		  Conf_Reader cr = new Conf_Reader();
		  return cr;
		  
	}	

	}


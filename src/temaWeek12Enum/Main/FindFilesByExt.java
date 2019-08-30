package temaWeek12Enum.Main;

import java.io.File;
import java.io.FilenameFilter;



public class FindFilesByExt implements FilenameFilter {
	
	
		private static String extension;
		
		public FindFilesByExt(String extension) {
			
			this.extension=extension;
		}
		
		@Override
		public boolean accept(File loc,String name) {
			if(name.lastIndexOf(".")>0){
				int lastIndex=name.lastIndexOf(".");
				String str=name.substring(lastIndex);
				if(extension.equalsIgnoreCase(str)){
					return true;
				}
			}
			return false;
		}
		
		
		
	}


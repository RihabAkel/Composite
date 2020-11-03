package composite.folder;

import java.util.ArrayList;
import java.util.List;

interface Component
	{
		void showInfo();
		void showSize();
	}

class Fichier implements Component
	{
		int size;
		String name;
		
		public Fichier(int size, String name) {
			super();
			this.size = size;
			this.name = name;
		}

		public void showInfo() {
			System.out.println("name"+": "+"size");
			}
		
		public void showSize() {
			System.out.println(size);
		}
	}



class Repertoire implements Component
	{	
		String name;
		List<Component> list=new ArrayList<>();
		
		
		public Repertoire(String name) {
			super();
			this.name = name;
		}

		public void addComponent(Component com) {
				list.add(com);
			}
		
		public void showInfo() {
				System.out.println(name);
				for(Component x : list) {
					x.showInfo();
					x.showSize();
				}
				}

		public int showSize() {
				int s=0;
				
				for(Component com : list)
					{s=s+showSize();}
				return s;
				}
		

		
	}

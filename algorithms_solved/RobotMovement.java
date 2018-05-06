
public class RobotMovement {
	final static int N=0,E=1,S=2,W=3;
	public static int setDir(String cr_loc){
		int c_loc=0;
		if(cr_loc.equals("N")){
			  c_loc=N;
		  }
		  else if(cr_loc.equals("E")){
			  c_loc=E;
		  }
		  else if(cr_loc.equals("S")){
			  c_loc=S;
			  }
		  else if(cr_loc.equals("W")){
			  c_loc=W;
		  }
		return c_loc;
	}
	public static String getDir(int cr_loc){
		String c_loc="";
		if(cr_loc==0){
			  c_loc="N";
		  }
		  else if(cr_loc==1){
			  c_loc="E";
		  }
		  else if(cr_loc==2){
			  c_loc="S";
			  }
		  else if(cr_loc==3){
			  c_loc="W";
		  }
		return c_loc;
	}
	public static String findPosition(int x,int y,String currL,String move){
		// direction as N North
		  
		  String s[]=currL.split("-");
		  
		  int c_x = Integer.valueOf(s[0]),  c_y= Integer.valueOf(s[1]);
		  int c_loc=setDir(s[2]);
		  
		  int i=0;
		  // Travels the path given for robot
		  for (i=0; i<move.length(); i++)
		  {
		    	 // Find current move
		      char mov = move.charAt(i);
		 
		      // If move is left or right, then change direction
		      if (mov == 'R')
		        c_loc = (c_loc + 1)%4;
		      else if (mov == 'L')
		    	  c_loc= (4 + c_loc - 1)%4;
		 
		      // If move is Go, then change  x or y according to
		      // current direction
		      else // if (move == 'G')
		      {
		         if (c_loc == N)
		            c_y++;
		         else if (c_loc == E)
		            c_x++;
		         else if (c_loc == S)
		            c_y--;
		         else // c_loc == W
		           c_x--;
		      }
		     
		  }
		  if(c_x>x ){
			  return ""+(c_x-(c_x-x))+"-"+(c_y-(c_y-y))+"-"+getDir(c_loc)+"-"+"ER";
		  }
		  else if(c_y>y)return ""+(c_x-(c_x-x))+"-"+(c_y-(c_y-y))+"-"+getDir(c_loc)+"-"+"ER";
			  
		  return ""+c_x+"-"+(c_y)+"-"+getDir(c_loc);
	}
	public static void main(String[] args) {
		String move="R M L M L M R M".replace(" ", "");
		String curr_loc="2-2-E";
		int x=3,y=3;
		System.out.println(findPosition(x, y, curr_loc,move));
		}
		
	}



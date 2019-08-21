package braised_prawns;

public class cook {
	
	
	public cook (String name){
		this.oil();
		this.pourSeasoning();
		this.pourShrimps();
		this.fireShrimps();
		this.pourBeer();
		
		this.mengShrimps();
		this.eatShrimps();
		
	}
    public void  oil(){
    	
    	System.out.println("倒油");
    }
    
    public void pourSeasoning(){
    	int a =5;
    	int b =10;
    	
    	System.out.println("倒调料,加"+a+"个大蒜，加"+b+"个生姜");
    }
    public void pourShrimps(){
    	
    	System.out.println("倒虾");
    }
    public  void fireShrimps(){
    	
    	System.out.println("炒虾");
    }
    
    public void pourBeer(){
    	
    	for(int i= 1;i<4;i++){
    		
    		System.out.println("第"+i+"次倒啤酒");
    		System.out.println("等一分钟");
    		
    	}
    }
    public void mengShrimps(){
    	System.out.println("关火");
    }
    public void eatShrimps(){
    	System.out.println("吃虾");
    }
    
    
}

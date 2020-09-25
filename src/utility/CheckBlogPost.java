package utility;

import model.Blog;
//import model.User;

public class CheckBlogPost extends OffensiveWordsChecker //implements OffensiveWordsInterface
{
	int i=0;
	String[] s= {"asshole","apeshit","arse","areshole","ass","ass fuch","assclown","assbite","assfaces","assfuck"};//,"assfucker","asshole"};
	@Override
	public boolean checkBlogTitle(Blog blog) 
	{
		String title=blog.getBlogTitle();
		  for(i=0;i<s.length;i++)
		  {
	    	   if(s[i].contains(title))
	    	   return true;
		   }
			  return false;
	}
	@Override
	public boolean checkBlogDescription(Blog blog) 
	{
       String des=blog.getBlogDescription();
       for(i=0;i<s.length;i++)
		  {
	    	   if(s[i].contains(des))
	    	   return true;
		   }
			  return false;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		
		if(checkBlogTitle(blog) && checkBlogDescription(blog))
		return false;
		else
		return true;
	}
}

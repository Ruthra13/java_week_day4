package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	
	String arr[] ={"2g1c",
			"4r5e",
			"5h1t",
			"5hit",
			"a$$",
			"a$$hole",
			"a_s_s",
			"a2m",
			"a54",
			"a55",
			"a55hole",
			"acrotomophilia",
			"aeolus",
			"ahole",
			"alabama hot pocket",
			"alaskan pipeline",
			"anal",
			"anal impaler",
			"anal leakage",
			"analprobe",
			"anilingus",
			"anus",
			"apeshit",
			"ar5e",
			"areola",
			"areole"};
	public boolean checkBlog(Blog blog)
	{
		boolean title = checkBlogTitle(blog);
		boolean description = checkBlogDescription(blog);
		
		if(title==true && description== true)
			return true;
		else
			return false;
		
	}
	
	public boolean checkBlogTitle(Blog blog)
	{
	
		String title = blog.getBlogTitle();
		int flag = 0;
		for(int i=0;i<arr.length;i++)
			{
				if(title.contains(arr[i]))
					{
						flag = 0;
					}
				else
					{
						flag = 1;
					}
			}
		if(flag == 1)
			return true;
		else
			return false;
	}
	
	
	public boolean checkBlogDescription(Blog blog) {
		String description = blog.getBlogDescription();
		int flag1 = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(description.contains(arr[i]))
				{
					flag1 = 0;
				}
			else
				{
					flag1 = 1;
				}
		}
		
		if(flag1 == 1)
			return true;
		else
			return false;
		
	}
	
	
}
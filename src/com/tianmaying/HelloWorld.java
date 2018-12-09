package com.tianmaying;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World！");
		Post post = new Post(1L, "22", "xxxx");
//		post.print();
		Post post2 = new Post(2L, "a1", "ffff");
//		post2.print();
		Post post3 = new Post(5L, "b1", "ffff");
		
		Post[] posts = {post, post2, post3};
		
		posts = Post.sortByTitle(posts);
		
		for(int i=0; i<posts.length; i++) {
			System.out.println(i+"-------");
			posts[i].print();
		}
	}

}
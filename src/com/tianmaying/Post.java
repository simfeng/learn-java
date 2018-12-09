package com.tianmaying;

public class Post {

	private Long id;
	private String title;
	private String content;
	// your code here
	private static String DEFAULT_TITLE = "这是一篇未命名博客";

	public String setTitle(String inTtile) {
		if (inTtile == null || inTtile.trim().equals("")) {
			return DEFAULT_TITLE;
		} else {
			return inTtile;
		}
	}

	public String getContent() {
		return content;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Post() {
		// your code here
		title = DEFAULT_TITLE;
	}

	public Post(String title, String content) {
		// your code here

		this.title = setTitle(title);
		this.content = content;
	}

	public Post(Long id, String title, String content) {
		// your code here
		this.id = id;
		this.title = setTitle(title);
		this.content = content;
	}

	public void print() {
		System.out.println(this.id);
		System.out.println(this.title);
		System.out.println(this.content);
	}

	public static Post[] sortById(Post[] posts) {
		// your code here
		for (int i = 0; i < posts.length; i++) {
			for (int j = i + 1; j < posts.length; j++) {
				if (posts[i].getId() > posts[j].getId()) {
					Post tempPost = posts[i];
					posts[i] = posts[j];
					posts[j] = tempPost;
				}
			}
		}
		return posts;
	}

	public static Post[] sortByTitle(Post[] posts) {
		// your code here
		for (int i = 0; i < posts.length; i++) {
			for (int j = i + 1; j < posts.length; j++) {
				if (posts[i].getTitle().compareToIgnoreCase(posts[j].getTitle())>0) {
					Post tempPost = posts[i];
					posts[i] = posts[j];
					posts[j] = tempPost;
				}
			}
		}
		return posts;
	}
}
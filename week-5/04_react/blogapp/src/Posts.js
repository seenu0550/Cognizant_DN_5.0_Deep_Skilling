import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    // Fetch posts from API
    loadPosts = () => {
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {
                const postList = data.map(
                    item =>
                        new Post(
                            item.userId,
                            item.id,
                            item.title,
                            item.body
                        )
                );

                this.setState({
                    posts: postList
                });
            })
            .catch(error => {
                throw error;
            });
    };

    // Lifecycle Hook
    componentDidMount() {
        this.loadPosts();
    }

    // Error Handling Lifecycle Hook
    componentDidCatch(error, info) {
        alert("Error: " + error.message);
    }

    render() {
        return (
            <div style={{ padding: "20px" }}>
                <h1>Blog Posts</h1>

                {this.state.posts.map(post => (
                    <div key={post.id}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;
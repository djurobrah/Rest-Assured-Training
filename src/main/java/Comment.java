public class Comment
{
    private int id;
    private String body;
    private int postId;

    public Comment(String body, int postId)
    {
        this.body = body;
        this.postId = postId;
    }

    public Comment(int id, String body, int postId)
    {
        this.id = id;
        this.body = body;
        this.postId = postId;
    }

    @Override
    public String toString()
    {
        return "Comment{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", postId=" + postId +
                '}';
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public int getPostId()
    {
        return postId;
    }

    public void setPostId(int postId)
    {
        this.postId = postId;
    }
}

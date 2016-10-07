package com.app2m.demo.hybrid.network.github;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ch on 2016/10/4.
 */

public class GitHubEventBean {

    /**
     * id : 4659355018
     * type : IssueCommentEvent
     * actor : {"id":67049,"login":"vbatts","display_login":"vbatts","gravatar_id":"","url":"https://api.github.com/users/vbatts","avatar_url":"https://avatars.githubusercontent.com/u/67049?"}
     * repo : {"id":61739430,"name":"containers/image","url":"https://api.github.com/repos/containers/image"}
     * payload : {"action":"created","issue":{"url":"https://api.github.com/repos/containers/image/issues/59","repository_url":"https://api.github.com/repos/containers/image","labels_url":"https://api.github.com/repos/containers/image/issues/59/labels{/name}","comments_url":"https://api.github.com/repos/containers/image/issues/59/comments","events_url":"https://api.github.com/repos/containers/image/issues/59/events","html_url":"https://github.com/containers/image/pull/59","id":173309741,"number":59,"title":"PROPOSAL: Image signature specification","user":{"login":"aweiteka","id":1764461,"avatar_url":"https://avatars.githubusercontent.com/u/1764461?v=3","gravatar_id":"","url":"https://api.github.com/users/aweiteka","html_url":"https://github.com/aweiteka","followers_url":"https://api.github.com/users/aweiteka/followers","following_url":"https://api.github.com/users/aweiteka/following{/other_user}","gists_url":"https://api.github.com/users/aweiteka/gists{/gist_id}","starred_url":"https://api.github.com/users/aweiteka/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/aweiteka/subscriptions","organizations_url":"https://api.github.com/users/aweiteka/orgs","repos_url":"https://api.github.com/users/aweiteka/repos","events_url":"https://api.github.com/users/aweiteka/events{/privacy}","received_events_url":"https://api.github.com/users/aweiteka/received_events","type":"User","site_admin":false},"labels":[],"state":"open","locked":false,"assignee":null,"assignees":[],"milestone":null,"comments":1,"created_at":"2016-08-25T21:03:55Z","updated_at":"2016-10-04T16:03:25Z","closed_at":null,"pull_request":{"url":"https://api.github.com/repos/containers/image/pulls/59","html_url":"https://github.com/containers/image/pull/59","diff_url":"https://github.com/containers/image/pull/59.diff","patch_url":"https://github.com/containers/image/pull/59.patch"},"body":"Proposed OCI image signing specification cc @philips @rhatdan @mtrmac "},"comment":{"url":"https://api.github.com/repos/containers/image/issues/comments/251433051","html_url":"https://github.com/containers/image/pull/59#issuecomment-251433051","issue_url":"https://api.github.com/repos/containers/image/issues/59","id":251433051,"user":{"login":"vbatts","id":67049,"avatar_url":"https://avatars.githubusercontent.com/u/67049?v=3","gravatar_id":"","url":"https://api.github.com/users/vbatts","html_url":"https://github.com/vbatts","followers_url":"https://api.github.com/users/vbatts/followers","following_url":"https://api.github.com/users/vbatts/following{/other_user}","gists_url":"https://api.github.com/users/vbatts/gists{/gist_id}","starred_url":"https://api.github.com/users/vbatts/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/vbatts/subscriptions","organizations_url":"https://api.github.com/users/vbatts/orgs","repos_url":"https://api.github.com/users/vbatts/repos","events_url":"https://api.github.com/users/vbatts/events{/privacy}","received_events_url":"https://api.github.com/users/vbatts/received_events","type":"User","site_admin":false},"created_at":"2016-10-04T16:03:25Z","updated_at":"2016-10-04T16:03:25Z","body":"cc @stevvooe"}}
     * public : true
     * created_at : 2016-10-04T16:03:25Z
     * org : {"id":5874934,"login":"containers","gravatar_id":"","url":"https://api.github.com/orgs/containers","avatar_url":"https://avatars.githubusercontent.com/u/5874934?"}
     */

    private String id;
    private String type;
    /**
     * id : 67049
     * login : vbatts
     * display_login : vbatts
     * gravatar_id :
     * url : https://api.github.com/users/vbatts
     * avatar_url : https://avatars.githubusercontent.com/u/67049?
     */

    private ActorBean actor;
    /**
     * id : 61739430
     * name : containers/image
     * url : https://api.github.com/repos/containers/image
     */

    private RepoBean repo;
    /**
     * action : created
     * issue : {"url":"https://api.github.com/repos/containers/image/issues/59","repository_url":"https://api.github.com/repos/containers/image","labels_url":"https://api.github.com/repos/containers/image/issues/59/labels{/name}","comments_url":"https://api.github.com/repos/containers/image/issues/59/comments","events_url":"https://api.github.com/repos/containers/image/issues/59/events","html_url":"https://github.com/containers/image/pull/59","id":173309741,"number":59,"title":"PROPOSAL: Image signature specification","user":{"login":"aweiteka","id":1764461,"avatar_url":"https://avatars.githubusercontent.com/u/1764461?v=3","gravatar_id":"","url":"https://api.github.com/users/aweiteka","html_url":"https://github.com/aweiteka","followers_url":"https://api.github.com/users/aweiteka/followers","following_url":"https://api.github.com/users/aweiteka/following{/other_user}","gists_url":"https://api.github.com/users/aweiteka/gists{/gist_id}","starred_url":"https://api.github.com/users/aweiteka/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/aweiteka/subscriptions","organizations_url":"https://api.github.com/users/aweiteka/orgs","repos_url":"https://api.github.com/users/aweiteka/repos","events_url":"https://api.github.com/users/aweiteka/events{/privacy}","received_events_url":"https://api.github.com/users/aweiteka/received_events","type":"User","site_admin":false},"labels":[],"state":"open","locked":false,"assignee":null,"assignees":[],"milestone":null,"comments":1,"created_at":"2016-08-25T21:03:55Z","updated_at":"2016-10-04T16:03:25Z","closed_at":null,"pull_request":{"url":"https://api.github.com/repos/containers/image/pulls/59","html_url":"https://github.com/containers/image/pull/59","diff_url":"https://github.com/containers/image/pull/59.diff","patch_url":"https://github.com/containers/image/pull/59.patch"},"body":"Proposed OCI image signing specification cc @philips @rhatdan @mtrmac "}
     * comment : {"url":"https://api.github.com/repos/containers/image/issues/comments/251433051","html_url":"https://github.com/containers/image/pull/59#issuecomment-251433051","issue_url":"https://api.github.com/repos/containers/image/issues/59","id":251433051,"user":{"login":"vbatts","id":67049,"avatar_url":"https://avatars.githubusercontent.com/u/67049?v=3","gravatar_id":"","url":"https://api.github.com/users/vbatts","html_url":"https://github.com/vbatts","followers_url":"https://api.github.com/users/vbatts/followers","following_url":"https://api.github.com/users/vbatts/following{/other_user}","gists_url":"https://api.github.com/users/vbatts/gists{/gist_id}","starred_url":"https://api.github.com/users/vbatts/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/vbatts/subscriptions","organizations_url":"https://api.github.com/users/vbatts/orgs","repos_url":"https://api.github.com/users/vbatts/repos","events_url":"https://api.github.com/users/vbatts/events{/privacy}","received_events_url":"https://api.github.com/users/vbatts/received_events","type":"User","site_admin":false},"created_at":"2016-10-04T16:03:25Z","updated_at":"2016-10-04T16:03:25Z","body":"cc @stevvooe"}
     */

    private PayloadBean payload;
    @SerializedName("public")
    private boolean publicX;
    private String created_at;
    /**
     * id : 5874934
     * login : containers
     * gravatar_id :
     * url : https://api.github.com/orgs/containers
     * avatar_url : https://avatars.githubusercontent.com/u/5874934?
     */

    private OrgBean org;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ActorBean getActor() {
        return actor;
    }

    public void setActor(ActorBean actor) {
        this.actor = actor;
    }

    public RepoBean getRepo() {
        return repo;
    }

    public void setRepo(RepoBean repo) {
        this.repo = repo;
    }

    public PayloadBean getPayload() {
        return payload;
    }

    public void setPayload(PayloadBean payload) {
        this.payload = payload;
    }

    public boolean isPublicX() {
        return publicX;
    }

    public void setPublicX(boolean publicX) {
        this.publicX = publicX;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public OrgBean getOrg() {
        return org;
    }

    public void setOrg(OrgBean org) {
        this.org = org;
    }

    public static class ActorBean {
        private int id;
        private String login;
        private String display_login;
        private String gravatar_id;
        private String url;
        private String avatar_url;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getDisplay_login() {
            return display_login;
        }

        public void setDisplay_login(String display_login) {
            this.display_login = display_login;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }
    }

    public static class RepoBean {
        private int id;
        private String name;
        private String url;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class PayloadBean {
        private String action;
        /**
         * url : https://api.github.com/repos/containers/image/issues/59
         * repository_url : https://api.github.com/repos/containers/image
         * labels_url : https://api.github.com/repos/containers/image/issues/59/labels{/name}
         * comments_url : https://api.github.com/repos/containers/image/issues/59/comments
         * events_url : https://api.github.com/repos/containers/image/issues/59/events
         * html_url : https://github.com/containers/image/pull/59
         * id : 173309741
         * number : 59
         * title : PROPOSAL: Image signature specification
         * user : {"login":"aweiteka","id":1764461,"avatar_url":"https://avatars.githubusercontent.com/u/1764461?v=3","gravatar_id":"","url":"https://api.github.com/users/aweiteka","html_url":"https://github.com/aweiteka","followers_url":"https://api.github.com/users/aweiteka/followers","following_url":"https://api.github.com/users/aweiteka/following{/other_user}","gists_url":"https://api.github.com/users/aweiteka/gists{/gist_id}","starred_url":"https://api.github.com/users/aweiteka/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/aweiteka/subscriptions","organizations_url":"https://api.github.com/users/aweiteka/orgs","repos_url":"https://api.github.com/users/aweiteka/repos","events_url":"https://api.github.com/users/aweiteka/events{/privacy}","received_events_url":"https://api.github.com/users/aweiteka/received_events","type":"User","site_admin":false}
         * labels : []
         * state : open
         * locked : false
         * assignee : null
         * assignees : []
         * milestone : null
         * comments : 1
         * created_at : 2016-08-25T21:03:55Z
         * updated_at : 2016-10-04T16:03:25Z
         * closed_at : null
         * pull_request : {"url":"https://api.github.com/repos/containers/image/pulls/59","html_url":"https://github.com/containers/image/pull/59","diff_url":"https://github.com/containers/image/pull/59.diff","patch_url":"https://github.com/containers/image/pull/59.patch"}
         * body : Proposed OCI image signing specification cc @philips @rhatdan @mtrmac
         */

        private IssueBean issue;
        /**
         * url : https://api.github.com/repos/containers/image/issues/comments/251433051
         * html_url : https://github.com/containers/image/pull/59#issuecomment-251433051
         * issue_url : https://api.github.com/repos/containers/image/issues/59
         * id : 251433051
         * user : {"login":"vbatts","id":67049,"avatar_url":"https://avatars.githubusercontent.com/u/67049?v=3","gravatar_id":"","url":"https://api.github.com/users/vbatts","html_url":"https://github.com/vbatts","followers_url":"https://api.github.com/users/vbatts/followers","following_url":"https://api.github.com/users/vbatts/following{/other_user}","gists_url":"https://api.github.com/users/vbatts/gists{/gist_id}","starred_url":"https://api.github.com/users/vbatts/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/vbatts/subscriptions","organizations_url":"https://api.github.com/users/vbatts/orgs","repos_url":"https://api.github.com/users/vbatts/repos","events_url":"https://api.github.com/users/vbatts/events{/privacy}","received_events_url":"https://api.github.com/users/vbatts/received_events","type":"User","site_admin":false}
         * created_at : 2016-10-04T16:03:25Z
         * updated_at : 2016-10-04T16:03:25Z
         * body : cc @stevvooe
         */

        private CommentBean comment;

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public IssueBean getIssue() {
            return issue;
        }

        public void setIssue(IssueBean issue) {
            this.issue = issue;
        }

        public CommentBean getComment() {
            return comment;
        }

        public void setComment(CommentBean comment) {
            this.comment = comment;
        }

        public static class IssueBean {
            private String url;
            private String repository_url;
            private String labels_url;
            private String comments_url;
            private String events_url;
            private String html_url;
            private int id;
            private int number;
            private String title;
            /**
             * login : aweiteka
             * id : 1764461
             * avatar_url : https://avatars.githubusercontent.com/u/1764461?v=3
             * gravatar_id :
             * url : https://api.github.com/users/aweiteka
             * html_url : https://github.com/aweiteka
             * followers_url : https://api.github.com/users/aweiteka/followers
             * following_url : https://api.github.com/users/aweiteka/following{/other_user}
             * gists_url : https://api.github.com/users/aweiteka/gists{/gist_id}
             * starred_url : https://api.github.com/users/aweiteka/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/aweiteka/subscriptions
             * organizations_url : https://api.github.com/users/aweiteka/orgs
             * repos_url : https://api.github.com/users/aweiteka/repos
             * events_url : https://api.github.com/users/aweiteka/events{/privacy}
             * received_events_url : https://api.github.com/users/aweiteka/received_events
             * type : User
             * site_admin : false
             */

            private UserBean user;
            private String state;
            private boolean locked;
            private Object assignee;
            private Object milestone;
            private int comments;
            private String created_at;
            private String updated_at;
            private Object closed_at;
            /**
             * url : https://api.github.com/repos/containers/image/pulls/59
             * html_url : https://github.com/containers/image/pull/59
             * diff_url : https://github.com/containers/image/pull/59.diff
             * patch_url : https://github.com/containers/image/pull/59.patch
             */

            private PullRequestBean pull_request;
            private String body;
            private List<?> labels;
            private List<?> assignees;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getRepository_url() {
                return repository_url;
            }

            public void setRepository_url(String repository_url) {
                this.repository_url = repository_url;
            }

            public String getLabels_url() {
                return labels_url;
            }

            public void setLabels_url(String labels_url) {
                this.labels_url = labels_url;
            }

            public String getComments_url() {
                return comments_url;
            }

            public void setComments_url(String comments_url) {
                this.comments_url = comments_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public boolean isLocked() {
                return locked;
            }

            public void setLocked(boolean locked) {
                this.locked = locked;
            }

            public Object getAssignee() {
                return assignee;
            }

            public void setAssignee(Object assignee) {
                this.assignee = assignee;
            }

            public Object getMilestone() {
                return milestone;
            }

            public void setMilestone(Object milestone) {
                this.milestone = milestone;
            }

            public int getComments() {
                return comments;
            }

            public void setComments(int comments) {
                this.comments = comments;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public Object getClosed_at() {
                return closed_at;
            }

            public void setClosed_at(Object closed_at) {
                this.closed_at = closed_at;
            }

            public PullRequestBean getPull_request() {
                return pull_request;
            }

            public void setPull_request(PullRequestBean pull_request) {
                this.pull_request = pull_request;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public List<?> getLabels() {
                return labels;
            }

            public void setLabels(List<?> labels) {
                this.labels = labels;
            }

            public List<?> getAssignees() {
                return assignees;
            }

            public void setAssignees(List<?> assignees) {
                this.assignees = assignees;
            }

            public static class UserBean {
                private String login;
                private int id;
                private String avatar_url;
                private String gravatar_id;
                private String url;
                private String html_url;
                private String followers_url;
                private String following_url;
                private String gists_url;
                private String starred_url;
                private String subscriptions_url;
                private String organizations_url;
                private String repos_url;
                private String events_url;
                private String received_events_url;
                private String type;
                private boolean site_admin;

                public String getLogin() {
                    return login;
                }

                public void setLogin(String login) {
                    this.login = login;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public String getGravatar_id() {
                    return gravatar_id;
                }

                public void setGravatar_id(String gravatar_id) {
                    this.gravatar_id = gravatar_id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public String getFollowers_url() {
                    return followers_url;
                }

                public void setFollowers_url(String followers_url) {
                    this.followers_url = followers_url;
                }

                public String getFollowing_url() {
                    return following_url;
                }

                public void setFollowing_url(String following_url) {
                    this.following_url = following_url;
                }

                public String getGists_url() {
                    return gists_url;
                }

                public void setGists_url(String gists_url) {
                    this.gists_url = gists_url;
                }

                public String getStarred_url() {
                    return starred_url;
                }

                public void setStarred_url(String starred_url) {
                    this.starred_url = starred_url;
                }

                public String getSubscriptions_url() {
                    return subscriptions_url;
                }

                public void setSubscriptions_url(String subscriptions_url) {
                    this.subscriptions_url = subscriptions_url;
                }

                public String getOrganizations_url() {
                    return organizations_url;
                }

                public void setOrganizations_url(String organizations_url) {
                    this.organizations_url = organizations_url;
                }

                public String getRepos_url() {
                    return repos_url;
                }

                public void setRepos_url(String repos_url) {
                    this.repos_url = repos_url;
                }

                public String getEvents_url() {
                    return events_url;
                }

                public void setEvents_url(String events_url) {
                    this.events_url = events_url;
                }

                public String getReceived_events_url() {
                    return received_events_url;
                }

                public void setReceived_events_url(String received_events_url) {
                    this.received_events_url = received_events_url;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public boolean isSite_admin() {
                    return site_admin;
                }

                public void setSite_admin(boolean site_admin) {
                    this.site_admin = site_admin;
                }
            }

            public static class PullRequestBean {
                private String url;
                private String html_url;
                private String diff_url;
                private String patch_url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public String getDiff_url() {
                    return diff_url;
                }

                public void setDiff_url(String diff_url) {
                    this.diff_url = diff_url;
                }

                public String getPatch_url() {
                    return patch_url;
                }

                public void setPatch_url(String patch_url) {
                    this.patch_url = patch_url;
                }
            }
        }

        public static class CommentBean {
            private String url;
            private String html_url;
            private String issue_url;
            private int id;
            /**
             * login : vbatts
             * id : 67049
             * avatar_url : https://avatars.githubusercontent.com/u/67049?v=3
             * gravatar_id :
             * url : https://api.github.com/users/vbatts
             * html_url : https://github.com/vbatts
             * followers_url : https://api.github.com/users/vbatts/followers
             * following_url : https://api.github.com/users/vbatts/following{/other_user}
             * gists_url : https://api.github.com/users/vbatts/gists{/gist_id}
             * starred_url : https://api.github.com/users/vbatts/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/vbatts/subscriptions
             * organizations_url : https://api.github.com/users/vbatts/orgs
             * repos_url : https://api.github.com/users/vbatts/repos
             * events_url : https://api.github.com/users/vbatts/events{/privacy}
             * received_events_url : https://api.github.com/users/vbatts/received_events
             * type : User
             * site_admin : false
             */

            private UserBean user;
            private String created_at;
            private String updated_at;
            private String body;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getIssue_url() {
                return issue_url;
            }

            public void setIssue_url(String issue_url) {
                this.issue_url = issue_url;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public static class UserBean {
                private String login;
                private int id;
                private String avatar_url;
                private String gravatar_id;
                private String url;
                private String html_url;
                private String followers_url;
                private String following_url;
                private String gists_url;
                private String starred_url;
                private String subscriptions_url;
                private String organizations_url;
                private String repos_url;
                private String events_url;
                private String received_events_url;
                private String type;
                private boolean site_admin;

                public String getLogin() {
                    return login;
                }

                public void setLogin(String login) {
                    this.login = login;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public String getGravatar_id() {
                    return gravatar_id;
                }

                public void setGravatar_id(String gravatar_id) {
                    this.gravatar_id = gravatar_id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public String getFollowers_url() {
                    return followers_url;
                }

                public void setFollowers_url(String followers_url) {
                    this.followers_url = followers_url;
                }

                public String getFollowing_url() {
                    return following_url;
                }

                public void setFollowing_url(String following_url) {
                    this.following_url = following_url;
                }

                public String getGists_url() {
                    return gists_url;
                }

                public void setGists_url(String gists_url) {
                    this.gists_url = gists_url;
                }

                public String getStarred_url() {
                    return starred_url;
                }

                public void setStarred_url(String starred_url) {
                    this.starred_url = starred_url;
                }

                public String getSubscriptions_url() {
                    return subscriptions_url;
                }

                public void setSubscriptions_url(String subscriptions_url) {
                    this.subscriptions_url = subscriptions_url;
                }

                public String getOrganizations_url() {
                    return organizations_url;
                }

                public void setOrganizations_url(String organizations_url) {
                    this.organizations_url = organizations_url;
                }

                public String getRepos_url() {
                    return repos_url;
                }

                public void setRepos_url(String repos_url) {
                    this.repos_url = repos_url;
                }

                public String getEvents_url() {
                    return events_url;
                }

                public void setEvents_url(String events_url) {
                    this.events_url = events_url;
                }

                public String getReceived_events_url() {
                    return received_events_url;
                }

                public void setReceived_events_url(String received_events_url) {
                    this.received_events_url = received_events_url;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public boolean isSite_admin() {
                    return site_admin;
                }

                public void setSite_admin(boolean site_admin) {
                    this.site_admin = site_admin;
                }
            }
        }
    }

    public static class OrgBean {
        private int id;
        private String login;
        private String gravatar_id;
        private String url;
        private String avatar_url;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }
    }
}

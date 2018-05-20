# Rest service interview questions 
- What implementation you use in REST web services?
- Where does the mapping happens in REST web services? explain that. How does the browser finds the web service url?
- Is it possible to get a different response format in a single controller class?
- What is @Produces will do?
- Is the REST web services is a thread safe?
- Explain what is Thread safe and how do you make the project as a thread safe? 
- What is idempotent and non-idempotent? Which http methods are idempotent and why?
- If there is a controller, there are 3 methods a, b and c. The controller calls all these methods and the calls to each method will produce the response in 3, 3, 2 second respectively. 
    How long will the rest controller willl take to respond? how do you reduce the response timing - it seems expecting something from async or parallel processing.
- How to log the REST request and response without reaching the controller?
- Security in REST: If you know particular url and the other person know the same url, how can you make your service as secure? What attribute you use to get those security 
    information and how do you make sure that it is secured? How do you integrate siteminder with your application?
- How does the conversion of request and response json to pojo and vice versa is happening in the REST controller? Who will do this? MediaType is not the correct answer.
- Is your REST is a stateless or stateful? How can you make sure that?
- How can you ensure that your REST services are secured. How can you achieve that?	

#  Thread questions
- What are the different ways of creating thread ? 
- How thread interaction happens ?  wait, notify, and notifyAll
- What is deadlock, how to prevent it
- How can we make variable thread safe without synchronize
- What is semaphore and Re-entrant – in-depth knowledge
- Scenario based questions on reentrant lock and synchronized - difference and which is better?
- Main advantages of reentrant over synchronized
- Lock levels
- Cached thread pool and fixed thread pool – difference	
	
# Garbage collection
- How does Garbage Collector works?
- How many GC algorithms do you know?
- What is permgern space?
- Which object except string object are stored in perm gen space?
- What are types of references in java. What is strong and weak references, how does garbage collection work. 
- Where to use weak reference – scenario based example?
- References and thread safety
- Is it advisable to force GC, what are the implications etc.
-  Heap memory and off heap memory management
- Finalize method – relation to GC and clean up – When it is invoked – who determines
- Performance:
 a)	CPU usage 100% - how to fix it
 b)	How to debug CPU full scenario	
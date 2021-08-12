package executorservice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		List<CallableTask> list=Arrays.asList(new CallableTask("Smith")
				,new CallableTask("john")
				,new CallableTask("adam"));
		//Future<String> result=executorService.submit(new CallableTask("Smith"));
//		List<Future<String>> results=executorService.invokeAll(list);
//		
//		for(Future<String> result:results)
//		{
//			System.out.println(result.get()+"\n");
//		}
		String result=executorService.invokeAny(list);
		System.out.println(result);
		executorService.shutdown();

	}

}

package ocr.goods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import otocloud.framework.app.engine.AppService;
import otocloud.framework.app.engine.AppServiceEngineImpl;
import otocloud.framework.core.OtoCloudComponent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import com.hazelcast.config.InvalidConfigurationException;
import com.hazelcast.nio.IOUtil;
import com.hazelcast.util.StringUtil;


/**
 * TODO: DOCUMENT ME!
 * @date 2016年11月26日
 * @author lijing@yonyou.com
 */
public class App extends AppServiceEngineImpl
{

	//创建此APP中租户的应用服务实例时调用
	@Override
	public AppService newAppInstance() {
		return new GoodsCenterService();
	}

	//创建此APP统一的web入口服务
/*	@Override
	public WebServer createWebServer() {
		return new MyWebServer();
	}*/

	//创建APP全局组件
	@Override
	public List<OtoCloudComponent> createServiceComponents() {
		return null;
	}
	
	
 /*   public static void main( String[] args )
    {
    	App app = new App();

    	AppServiceEngineImpl.internalMain("log4j2.xml",
    										"ocr-goods.center.json", 
    										app);
    	
    }*/
    


}

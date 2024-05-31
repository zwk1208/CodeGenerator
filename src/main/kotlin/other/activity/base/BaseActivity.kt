package other.activity.base

import other.ArmsPluginTemplateProviderImpl
import other.activity.activityAnnotation

/**
 * olamet基础Activity生成类
 * 创建人 zhengwenkai
 * 创建日期 2024/5/31 01:00
 * 描述 BaseActivity
 *
 */
fun baseActivity(isKt: Boolean,providerImpl: ArmsPluginTemplateProviderImpl) = if (isKt) baseActivityKt(providerImpl) else baseActivityJava(providerImpl)

fun baseActivityKt(providerImpl: ArmsPluginTemplateProviderImpl) = """
package ${providerImpl.activityPackageName.value}

import android.os.Bundle
import com.olamet.mobile.base.activity.BaseActivity
import ${providerImpl.appPackageName.value}.databinding.Activity${providerImpl.pageName.value}Binding
import com.tongdaxing.xchat_core.ext.inflate

${activityAnnotation(providerImpl)}
class ${providerImpl.pageName.value}Activity: BaseActivity() {

    private val binding by inflate<Activity${providerImpl.pageName.value}Binding>()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        initClick()
    }


    private fun initView() {
        
    }
    
    private fun initClick() {
        
    }

}
  
"""

fun baseActivityJava(providerImpl: ArmsPluginTemplateProviderImpl) = """
package ${providerImpl.activityPackageName.value}

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.olamet.mobile.base.activity.BaseActivity;
import ${providerImpl.appPackageName.value}.R;

${activityAnnotation(providerImpl)}
public class ${providerImpl.pageName.value}Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_${providerImpl.pageName.value[0].lowercaseChar()}${providerImpl.pageName.value.substring(1, providerImpl.pageName. value.length)});
        initView();
        initClick();
    }
    
    public static void start(Context context){
        Intent intent = new Intent(context, ${providerImpl.pageName.value}Activity.class);
        context.startActivity(intent);
    }

    private void initView() {
        
    }

    private void initClick() {

    }

}
  
"""

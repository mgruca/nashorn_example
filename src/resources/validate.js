/**
 * User: Michal
 * Date: 2015-04-04
 */
function validateMyForm(params){
    return JSON.parse(params).name.length > 3
}